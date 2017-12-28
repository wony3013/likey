package kr.or.nextit.common.file.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.nextit.common.file.mapper.FileItemMapper;
import kr.or.nextit.common.file.model.FileItem;
import kr.or.nextit.common.file.service.FileItemService;

@Service("FileItemService")
public class FileItemServiceImpl implements FileItemService {
	
	@Autowired
	FileItemMapper fileItemMapper;
	
	@Override
	public List<FileItem> getFileItemList(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileItem getFileItem(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertFileItem(FileItem fileItem) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteFileItem(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDownloadCnt(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
