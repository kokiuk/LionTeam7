package com.example.todaylook.dto;

import com.example.todaylook.entity.BlackList;
import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BlackListDto {
    private Long id;
    @Setter
    private Long blacking_user;
    @Setter
    private Long blacked_user;
    @Setter
    private String create_at;

    public static BlackListDto fromEntity (BlackList entity){
        return BlackListDto.builder()
                .id(entity.getId())
                .blacking_user(entity.getBlacking_user())
                .blacked_user(entity.getBlacked_user())
                .create_at(entity.getCreate_at())
                .build();
    }
}
