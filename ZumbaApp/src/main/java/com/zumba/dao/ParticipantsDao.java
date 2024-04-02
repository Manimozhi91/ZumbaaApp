package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zumba.bean.Batch;
import com.zumba.bean.Participants;
import com.zumba.resource.DbResource;

public class ParticipantsDao {

		public int storeParticipantsDetails(Participants participants) {
			try {
				Connection con=DbResource.getDBConnection();
				PreparedStatement ps=con.prepareStatement("insert into participants (pname,age,phonenumber,batchid)values(?,?,?,?)");
				ps.setString(1,participants.getPname());
				ps.setInt(2,participants.getAge());
				ps.setString(3,participants.getPhonenumber());
				ps.setInt(4,participants.getBatchid());

				return ps.executeUpdate();
			}catch (Exception e) {
				System.err.println("Participants insertion error"+e.toString());
			}
			return 0;
		}

		public int deleteParticipant(int pid) {
			try {
				Connection con = DbResource.getDBConnection();
				PreparedStatement pstmt = con.prepareStatement("delete from participants where pid = ?");
				pstmt.setInt(1, pid);
				return pstmt.executeUpdate();
				} catch (Exception e) {
					System.err.println(e);
					return 0;
				}
			}

		public int updateParticipant(Participants p) {
			try {
				Connection con = DbResource.getDBConnection();
				PreparedStatement pstmt = con.prepareStatement("update participants set  phonenumber=? where pid = ?");
				pstmt.setString(1, p.getPhonenumber());
				pstmt.setInt(2,p.getPid());

				System.out.println(p);
				return pstmt.executeUpdate();
				} catch (Exception e) {
					System.err.println(e);
					return 0;
				}
		}
			
		}
	

