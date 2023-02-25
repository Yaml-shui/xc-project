package com.xc.content.service;

import com.xc.content.model.dto.CoursePreviewDto;

/**
 * 课程预览、发布接口
 */
public interface CoursePublishService {


    /**
     * 获取课程预览信息
     *
     * @param courseId 课程id
     */
    CoursePreviewDto getCoursePreviewInfo(Long courseId);

    /**
     * 提交审核
     * @param companyId
     * @param courseId 课程id
     */
    void commitAudit(Long companyId, Long courseId);

    /**
     * 课程发布接口
     * @param companyId
     * @param courseId
     */
    public void publish(Long companyId,Long courseId);
}