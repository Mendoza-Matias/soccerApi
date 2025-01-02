package com.mmendoza.soccerApi.repository;

import com.mmendoza.soccerApi.entities.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILabelRepository extends JpaRepository<Label, Integer> {
}
