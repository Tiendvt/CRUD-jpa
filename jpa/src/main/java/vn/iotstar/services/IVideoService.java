package vn.iotstar.services;

import java.util.List;

import vn.iotstar.entity.Video;

public interface IVideoService {
    List<Video> findAll();
    Video findById(String videoId);
    void delete(String videoId) throws Exception;
    void update(Video video);
    void insert(Video video);
}