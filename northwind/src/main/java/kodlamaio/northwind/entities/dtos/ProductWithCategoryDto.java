package kodlamaio.northwind.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductWithCategoryDto {
    //dto: data transformation object
    private int id;
    private String productName;
    private String categoryName;
}
