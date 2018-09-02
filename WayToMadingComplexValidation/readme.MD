With Spring MVC, there are 3 different ways to perform validation : 
 1. using annotation, 
 2. manually, 
 3. or a mix of both. 
 There is not a unique "cleanest and best way" to validate, 
 but there is probably one that fits your project/problem/context better.

========================================================================
1) Light validation (with JSR-303/Hibernate validation) : checking that a submitted field has a given @Size/@Length, that it is @NotNull or @NotEmpty/@NotBlank, checking that it has an @Email format, etc.

2) Heavy validation, or complex validation are more about particular cases of field validations, such as cross-field validation :

Example 1 : The form has fieldA, fieldB and fieldC. Individually, each field can be empty, but at least one of them must not be empty.
Example 2 : if userAge field has a value under 18, responsibleUser field must not be null and responsibleUser's age must be over 21.