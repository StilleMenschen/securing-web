package tech.tystnad.works.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tech.tystnad.works.core.service.BaseService;
import tech.tystnad.works.model.ResponseObjectEntity;
import tech.tystnad.works.repository.domain.SysAuthorityDO;
import tech.tystnad.works.repository.domain.SysAuthorityDOExample;
import tech.tystnad.works.repository.mapper.SysAuthorityDOMapper;
import tech.tystnad.works.service.SysAuthorityService;

import java.util.List;

public class SysAuthorityServiceImpl extends BaseService implements SysAuthorityService {

    private final SysAuthorityDOMapper sysAuthorityDOMapper;

    @Autowired
    public SysAuthorityServiceImpl(SysAuthorityDOMapper sysAuthorityDOMapper) {
        this.sysAuthorityDOMapper = sysAuthorityDOMapper;
    }

    @Override
    public ResponseObjectEntity<?> delete(Short sysAuthorityId) {
        sysAuthorityDOMapper.deleteByPrimaryKey(sysAuthorityId);
        return ok(null);
    }

    @Override
    public ResponseObjectEntity<?> delete(List<Short> sysAuthorityIds) {
        SysAuthorityDOExample example = new SysAuthorityDOExample();
        example.createCriteria().andAuthIdIn(sysAuthorityIds);
        sysAuthorityDOMapper.deleteByExample(example);
        return ok(null);
    }

    @Override
    public ResponseObjectEntity<SysAuthorityDO> search(Short sysAuthorityId) {
        return ok(sysAuthorityDOMapper.selectByPrimaryKey(sysAuthorityId));
    }

    @Override
    public ResponseObjectEntity<SysAuthorityDO> search(SysAuthorityDO SysAuthorityDO) {
        return null;
    }
}