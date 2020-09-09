package ch.noseryoung.uk.businessObject.user.dto;

import ch.noseryoung.uk.businessObject.role.Role;
import ch.noseryoung.uk.businessObject.user.User;
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
public class UserMapperImpl implements UserMapper {

    @Override
    public User fromDTO(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setUsername( dto.getUsername() );
        user.setPassword( dto.getPassword() );
        Set<Role> set = dto.getRoles();
        if ( set != null ) {
            user.setRoles( new HashSet<Role>( set ) );
        }
        user.setLocked( dto.getLocked() );
        user.setEnabled( dto.getEnabled() );

        return user;
    }

    @Override
    public List<User> fromDTOs(List<UserDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtos.size() );
        for ( UserDTO userDTO : dtos ) {
            list.add( fromDTO( userDTO ) );
        }

        return list;
    }

    @Override
    public Set<User> fromDTOs(Set<UserDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<User> set = new HashSet<User>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( UserDTO userDTO : dtos ) {
            set.add( fromDTO( userDTO ) );
        }

        return set;
    }

    @Override
    public UserDTO toDTO(User dm) {
        if ( dm == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( dm.getId() );
        userDTO.setUsername( dm.getUsername() );
        userDTO.setPassword( dm.getPassword() );
        Set<Role> set = dm.getRoles();
        if ( set != null ) {
            userDTO.setRoles( new HashSet<Role>( set ) );
        }
        userDTO.setLocked( dm.getLocked() );
        userDTO.setEnabled( dm.getEnabled() );

        return userDTO;
    }

    @Override
    public List<UserDTO> toDTOs(List<User> dms) {
        if ( dms == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( dms.size() );
        for ( User user : dms ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public Set<UserDTO> toDTOs(Set<User> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<UserDTO> set = new HashSet<UserDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( User user : dms ) {
            set.add( toDTO( user ) );
        }

        return set;
    }
}
