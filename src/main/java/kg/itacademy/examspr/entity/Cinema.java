package kg.itacademy.examspr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "cinema")
public class Cinema extends EntityBase{
    @Column(name = "cinema_password")
    private String password;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "sits_count", nullable = false)
    private Integer sitsCount;
}
