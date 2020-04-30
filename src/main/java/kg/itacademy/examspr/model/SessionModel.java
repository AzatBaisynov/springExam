package kg.itacademy.examspr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionModel {
    private Boolean is3D;
    private LocalDateTime date;
    private Long filmId;
    private Long cinemaId;
}
