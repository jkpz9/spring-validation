@Controller
public class UserController {
  @RequestMapping(value="/user", method=RequestMethod.POST)
    public createUser(Model model, @ModelAttribute("user") User user, BindingResult result){
        UserValidator userValidator = new UserValidator();
        userValidator.validate(user, result);

        if (result.hasErrors()){
          // do something
        }
        else {
          // do something else
        }
}
========================================================
public @ResponseBody Result save(@Valid Entity entity, BindingResult errors) {
  Result r = new Result();
  if (errors.hasErrors()) {
      r.setStatus(Result.VALIDATION_ERROR);     
      // ...   
  } else {
      try {
          dao.save(entity);
          r.setStatus(Result.SUCCESS);
      } except (ValidationException e) {
          r.setStatus(Result.VALIDATION_ERROR);
          r.setText(e.getMessage());
      }
  }
  return r;
}


}