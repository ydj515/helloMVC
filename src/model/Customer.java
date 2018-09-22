package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // getter
@Setter // setter
@AllArgsConstructor // 생성자
public class Customer {

	private String id;
	private String name;
	private String email;

}
