
@Controller
@RequestMapping("/home")
public class ToppageController {
	@RequestMapping(method=RequestMethod.GET)
    public String home() {
        return "home";
}
