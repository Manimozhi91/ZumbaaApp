package com.zumba.service;

import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.dao.BatchDao;

public class BatchService {
	BatchDao db = new BatchDao() ;
	public String storeBatch(Batch batch) {
		if(db.storeBatchDetails(batch)>0) {
			return "Batch details stored Successfully";
		}else {
			return "Batch details not stored ";

		}
		
	}
	public List<Batch> findAllBatch(){
		return db.findAllBatchInfo();
	}
	public List<Object[]> findBatchAndStudentInfo(){
		return db.findBatchAndStudentInfo();
		
	}
	public String updateBatch(Batch bat) {
		if(db.updateBatch( bat)>0) {
			return "Batch details Successfully Updated";
		}else {
			return "Batch details Not Updated or Batch not available";

		}
	}
	public String deleteBatch(int batchid) {
		if(db.deleteBatch(batchid)>0) {
			return "Batch details Successfully Deleted";
		}else {
			return "Batch details Not Present to delete";

		}	}
}
