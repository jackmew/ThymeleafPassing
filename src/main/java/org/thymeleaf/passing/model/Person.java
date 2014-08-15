/**
 * 
 */
package org.thymeleaf.passing.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author jackho
 *
 */
public class Person {
	@Size(min=2, max=30 , message = "{error.person.name.size}")
    private String name;

    @NotNull(message = "{error.person.age.null}")
    @Min(value = 18 , message = "{error.person.age.min}") //@Min(18)
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
