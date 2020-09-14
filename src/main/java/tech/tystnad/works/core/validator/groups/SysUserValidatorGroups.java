package tech.tystnad.works.core.validator.groups;

/**
 * 用于HibernateValidator校验的分组,只需要定义一个接口
 */
public class SysUserValidatorGroups {
    /**
     * 添加数据的校验分组
     */
    public interface addGroup {
    }

    /**
     * 删除数据的校验分组
     */
    public interface deleteGroup {
    }

    /**
     * 查询数据的校验分组
     */
    public interface queryGroup {
    }
}
