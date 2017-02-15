package com.nicefish.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicefish.dao.PostMapper;
import com.nicefish.model.Post;
import com.nicefish.service.PostService;

@Service("postService")
public class PostServiceImpl implements PostService {

	@Autowired
	private PostMapper postMapper;

	@Override
	public int insert(Post model) {
		return postMapper.insertSelective(model);
	}
	
	@Override
	public Post findById(String id) {
		return postMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<Post> findAll() {
		return postMapper.findAll();
	}
	
	@Override
	public int delete(String id) {
		return postMapper.deleteByPrimaryKey(id);
	}
}
