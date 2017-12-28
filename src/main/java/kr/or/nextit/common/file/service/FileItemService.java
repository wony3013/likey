package kr.or.nextit.common.file.service;

import java.util.List;
import java.util.Map;

import kr.or.nextit.common.file.model.FileItem;

public interface FileItemService {
	
	public List<FileItem> getFileItemList(Map<String, Object> paramMap) throws Exception;
	
	public FileItem getFileItem(Map<String, Object> paramMap) throws Exception;
	
	public int insertFileItem(FileItem fileItem) throws Exception;
	
	public int deleteFileItem(Map<String, Object> paramMap) throws Exception;
	
	public int updateDownloadCnt(Map<String, Object> paramMap) throws Exception;

}
