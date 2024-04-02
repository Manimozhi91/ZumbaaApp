package com.zumba.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.zumba.resource.DbResource;
import com.zumba.bean.Batch;

public class BatchDao {
	public int storeBatchDetails(Batch batch) {
		try {
			Connection con=DbResource.getDBConnection();
			PreparedStatement ps=con.prepareStatement("insert into batch values(?,?,?)");
			ps.setInt(1,batch.getBatchid());
			ps.setString(2,batch.getTypeofbatch());
			ps.setString(3,batch.getTime());
			
			return ps.executeUpdate();
			
		}catch (Exception e) {
			System.err.println("Batch insertion error"+e.toString());
		}
		return 0;
	}

public List<Batch> findAllBatchInfo(){
	List<Batch> listOfbatch=new ArrayList();
	try {
		Connection con=DbResource.getDBConnection();
		PreparedStatement ps=con.prepareStatement("select * from Batch");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Batch batch=new Batch();
			batch.setBatchid(rs.getInt(1));
			batch.setTypeofbatch(rs.getString(2));
			batch.setTime(rs.getString(3));
			listOfbatch.add(batch);
			
		}
		}catch (Exception e) {
			System.err.println("Batch retriving error"+e.toString());
		}
		return listOfbatch;
	}
public List<Object[]> findBatchAndStudentInfo(){
	List<Object[]> listOfbatch=new ArrayList();
	try {
		Connection con=DbResource.getDBConnection();
		PreparedStatement ps=con.prepareStatement("select b.typeofbatch,b.time,p.pname,p.age from Batch b,participants p where b.batchid=p.batchid");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Object  obj[]=new Object[4];
			obj[0]=rs.getString(1);
			obj[1]=rs.getString(2);
			obj[2]=rs.getString(3);
			obj[3]=rs.getInt(4);
			listOfbatch.add(obj);
			
		}
		}catch (Exception e) {
			System.err.println("Batch retriving error"+e.toString());
		}
		return listOfbatch;
	}

public int updateBatch(Batch bat) {
	try {
		Connection con = DbResource.getDBConnection();
		PreparedStatement pstmt = con.prepareStatement("update Batch set typeofbatch=?, time = ? where batchid = ?");
		pstmt.setString(1, bat.getTypeofbatch());
		pstmt.setString(2, bat.getTime());
		pstmt.setInt(3, bat.getBatchid());

		System.out.println(bat);
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	
}
public int deleteBatch(int batchid) {
	try {
		Connection con = DbResource.getDBConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from Batch where batchid = ?");
		pstmt.setInt(1, batchid);
		return pstmt.executeUpdate();
		
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}}
	
	
}

