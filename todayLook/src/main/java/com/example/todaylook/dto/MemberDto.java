package com.example.todaylook.dto;

import com.example.todaylook.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class MemberDto {
    private Long id;
    @Setter
    private String username;
    @Setter
    private String password;
    @Setter
    private String email;
    @Setter
    private String phone;
    @Setter
    private String birthday;
    @Setter
    private String profile_name;
    @Setter
    private String profile_image;
    @Setter
    private String created_at;

    public MemberDto(Long id, String username, String password, String email, String phone, String birthday, String profile_name, String profile_image, String created_at) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.profile_name = profile_name;
        this.profile_image = profile_image;
        this.created_at = created_at;
    }

    public static MemberDto fromEntity(Member entity){
        MemberDto dto = new MemberDto();
        dto.id = entity.getId();
        dto.username = entity.getUsername();
        dto.password = entity.getPassword();
        dto.email = entity.getEmail();
        dto.phone = entity.getPhone();
        dto.birthday = entity.getBirthday();
        dto.profile_name = entity.getProfile_name();
        dto.profile_image = entity.getProfile_image();
        dto.created_at = entity.getCreated_at();
        return dto;
    }
}
