package task.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;

    @Override
    public String toString() {
        return  name + " - " + price;
    }

    public static class ServiceBuilder {
        private Service newService;

        public ServiceBuilder() {
            newService = new Service();
        }

        public ServiceBuilder withId(int id) {
            newService.id = id;
            return this;
        }

        public ServiceBuilder withName(String name) {
            newService.name = name;
            return this;
        }

        public ServiceBuilder withPrice(int price) {
            newService.price = price;
            return this;
        }

        public Service build() {
            return newService;
        }
    }
}
