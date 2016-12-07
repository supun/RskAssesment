package ras.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ras.backend.dao.MessengerData;

public interface IMessengerDataRepository extends JpaRepository<MessengerData, Long>, JpaSpecificationExecutor<MessengerData>

{

}
