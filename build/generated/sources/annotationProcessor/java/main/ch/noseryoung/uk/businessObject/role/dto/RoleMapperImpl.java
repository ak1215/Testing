package ch.noseryoung.uk.businessObject.role.dto;

import ch.noseryoung.uk.businessObject.authority.Authority;
import ch.noseryoung.uk.businessObject.role.Role;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-09T13:49:44+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role fromDTO(RoleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( dto.getId() );
        role.setName( dto.getName() );
        Set<Authority> set = dto.getAuthorities();
        if ( set != null ) {
            role.setAuthorities( new HashSet<Authority>( set ) );
        }

        return role;
    }

    @Override
    public List<Role> fromDTOs(List<RoleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( dtos.size() );
        for ( RoleDTO roleDTO : dtos ) {
            list.add( fromDTO( roleDTO ) );
        }

        return list;
    }

    @Override
    public Set<Role> fromDTOs(Set<RoleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Role> set = new HashSet<Role>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( RoleDTO roleDTO : dtos ) {
            set.add( fromDTO( roleDTO ) );
        }

        return set;
    }

    @Override
    public RoleDTO toDTO(Role dm) {
        if ( dm == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( dm.getId() );
        roleDTO.setName( dm.getName() );
        Set<Authority> set = dm.getAuthorities();
        if ( set != null ) {
            roleDTO.setAuthorities( new HashSet<Authority>( set ) );
        }

        return roleDTO;
    }

    @Override
    public List<RoleDTO> toDTOs(List<Role> dms) {
        if ( dms == null ) {
            return null;
        }

        List<RoleDTO> list = new ArrayList<RoleDTO>( dms.size() );
        for ( Role role : dms ) {
            list.add( toDTO( role ) );
        }

        return list;
    }

    @Override
    public Set<RoleDTO> toDTOs(Set<Role> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<RoleDTO> set = new HashSet<RoleDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Role role : dms ) {
            set.add( toDTO( role ) );
        }

        return set;
    }
}
