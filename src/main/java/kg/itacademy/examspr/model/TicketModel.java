package kg.itacademy.examspr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketModel {
    private Long clientId;
    private Long sessionId;
    private Integer price;
    private Integer sit;
    private Boolean isBought;
}
