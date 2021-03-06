package com.easychat.repository;

import com.easychat.model.entity.GroupRelationship;
import com.easychat.repository.custom.GroupRelationshipRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yonah on 15-11-23.
 */
public interface GroupRelationshipRepository extends JpaRepository<GroupRelationship, Long>, GroupRelationshipRepositoryCustom {
    List<GroupRelationship> findByGid(Long gid);
    GroupRelationship findByGidAndUid(Long gid, Long uid);
}
