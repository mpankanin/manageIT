package com.mas.manageIT.mapper;

import com.mas.manageIT.associacion_manager.ObjectPlus;
import com.mas.manageIT.associacion_manager.ObjectPlusPlus;
import com.mas.manageIT.entity.ProjectTeamEntity;
import com.mas.manageIT.entity.TeamMemberEntity;
import com.mas.manageIT.model.Customer;
import com.mas.manageIT.model.ProjectTeam;
import com.mas.manageIT.model.TeamMember;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class TeamMemberMapper {

    private static final Logger logger = LoggerFactory.getLogger(TeamMember.class);


    public static TeamMember toModel(TeamMemberEntity teamMemberEntity) {
        TeamMember teamMember = new TeamMember();

        teamMember.setId(teamMemberEntity.getId());
        teamMember.setFirstName(teamMemberEntity.getFirstName());
        teamMember.setLastName(teamMemberEntity.getLastName());
        teamMember.setBirthDate(teamMemberEntity.getBirthDate());
        teamMember.setEmail(teamMemberEntity.getEmail());
        teamMember.setPhoneNumber(teamMemberEntity.getPhoneNumber());
        teamMember.setCorrespondenceAddress(teamMemberEntity.getCorrespondenceAddress());
        teamMember.setIsArmyMember(teamMemberEntity.getIsArmyMember());
        teamMember.setMaidenName(teamMemberEntity.getMaidenName());
        teamMember.setIsPregnant(teamMemberEntity.getIsPregnant());
        teamMember.setHireDate(teamMemberEntity.getHireDate());
        teamMember.setReleaseDate(teamMemberEntity.getReleaseDate());
        teamMember.setSalary(teamMemberEntity.getSalary());
        teamMember.setBonus(teamMemberEntity.getBonus());
        teamMember.setRole(teamMemberEntity.getRole());
        teamMember.setMbaDate(teamMemberEntity.getMbaDate());
        return teamMember;
    }

    public static TeamMemberEntity toEntity(TeamMember teamMember) {
        TeamMemberEntity teamMemberEntity = new TeamMemberEntity();

        teamMemberEntity.setId(teamMember.getId());
        teamMemberEntity.setFirstName(teamMember.getFirstName());
        teamMemberEntity.setLastName(teamMember.getLastName());
        teamMemberEntity.setBirthDate(teamMember.getBirthDate());
        teamMemberEntity.setEmail(teamMember.getEmail());
        teamMemberEntity.setPhoneNumber(teamMember.getPhoneNumber());
        teamMemberEntity.setCorrespondenceAddress(teamMember.getCorrespondenceAddress());
        teamMemberEntity.setIsArmyMember(teamMember.getIsArmyMember());
        teamMemberEntity.setMaidenName(teamMember.getMaidenName());
        teamMemberEntity.setIsPregnant(teamMember.getIsPregnant());
        teamMemberEntity.setHireDate(teamMember.getHireDate());
        teamMemberEntity.setReleaseDate(teamMember.getReleaseDate());
        teamMemberEntity.setSalary(teamMember.getSalary());
        teamMemberEntity.setBonus(teamMember.getBonus());
        teamMemberEntity.setRole(teamMember.getRole());
        teamMemberEntity.setMbaDate(teamMember.getMbaDate());
        return teamMemberEntity;
    }

}
