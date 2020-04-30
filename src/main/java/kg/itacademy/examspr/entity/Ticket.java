package kg.itacademy.examspr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ticket")
public class Ticket extends EntityBase {
    @ManyToOne
    @JoinColumn(name = "session_id", nullable = false)
    private Session session;
    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "sit_number", nullable = false)
    private Integer sit;
    @Column(name = "is_bought", nullable = false)
    private Boolean isBought;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
