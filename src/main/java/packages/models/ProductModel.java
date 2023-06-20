package packages.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Tb_products")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idProduct;
	private String name;
	private BigDecimal value;
	
		
	}


