package ma.formations.multiconnector.dtos.bankaccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formations.multiconnector.dtos.customer.CustomerDto;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BankAccountDto {
    private Long id;

    private String rib;
    private Double amount;
    private String createdAt;
    private String accountStatus;
    private CustomerDto customer;
}
