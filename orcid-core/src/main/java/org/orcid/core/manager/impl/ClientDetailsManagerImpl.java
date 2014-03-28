package org.orcid.core.manager.impl;

import javax.annotation.Resource;

import org.orcid.core.manager.ClientDetailsManager;
import org.orcid.persistence.dao.ClientDetailsDao;
import org.orcid.persistence.jpa.entities.ClientDetailsEntity;
import org.springframework.cache.annotation.Cacheable;

public class ClientDetailsManagerImpl implements ClientDetailsManager {

    @Resource
    ClientDetailsDao clientDetailsDao;

    @Override    
    @Cacheable(value = "client-details", key = "T(org.orcid.jaxb.model.message.OrcidProfile).createCacheKey(#orcid, #lastModifiedDate)")
    public ClientDetailsEntity findByClientId(String orcid) {
        return clientDetailsDao.findByClientId1(orcid);
    }

    @Override
    public void removeByClientId(String clientId) {
        clientDetailsDao.removeByClientId(clientId);
    }

    @Override
    public void persist(ClientDetailsEntity clientDetails) {
        clientDetailsDao.persist(clientDetails);
    }

    @Override
    public ClientDetailsEntity merge(ClientDetailsEntity clientDetails) {
        return clientDetailsDao.merge(clientDetails);
    }
}
