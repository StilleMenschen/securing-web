package tech.tystnad.works.service;


import tech.tystnad.works.model.TaskGroup;

/**
 * Created by wangpeng on 2017/4/18.
 */
public interface TaskGroupService {
    TaskGroup add(TaskGroup group, String projectId);
    TaskGroup delete(String id);
    TaskGroup findById(String id);
    TaskGroup update(TaskGroup group);
}
