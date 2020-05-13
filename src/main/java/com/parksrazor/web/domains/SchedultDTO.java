package com.parksrazor.web.domains;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SchedultDTO {
    public String scheDate, stadiumId, gubun, hometeamId, awayteamId, homeScore, awayScore;
}
