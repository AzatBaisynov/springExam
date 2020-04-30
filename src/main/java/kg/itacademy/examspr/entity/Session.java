package kg.itacademy.examspr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sessions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session extends EntityBase{
    @Column(name = "is_3D")
    private Boolean is3D;
    @Column(name = "time")
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;
}
