package kenming.casestudy.turtlestore;

import java.util.*;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;  

import kenming.casestudy.turtlestore.model.*;
  
@Controller  
public class TurtleController {  
  
    @RequestMapping(value = "/turtlehome", method = RequestMethod.GET) 
    public ModelAndView BuyTurtleForm() { 
       
    	Shopper shopper = new Shopper();
    	shopper.setShoppingList(this.getTurtleList());  // 取得烏龜清單
    	
		// System.out.println(spform);
		//System.out.println(spform.getTurtles().get(0).get龜名());
    	
    	ModelAndView map = new ModelAndView("TurtleShoppingForm");
        map.addObject("shopper", shopper);

        return map;
    } 
    
	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public ModelAndView checkout(@ModelAttribute("shopper")Shopper shopper) {
		// List<烏龜商品> turtles = shopper.getShoppingList();
		/*
		if(null !=  turtles &&  turtles.size() > 0) {
			for (烏龜商品 turtle : turtles) {
				System.out.println(turtles.size());
				System.out.println(turtles.get(0).get龜名());
			}
		}*/
		
		shopper.setTotalPrice(8888);				// pseudo
		
		return new ModelAndView("addToCart", "shopper", shopper);
	}
	
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
	public String saveOrder() {
		
		return "saveOrder";
	}
    
    // 模擬從後端取得烏龜商品清單
    private List<烏龜商品> getTurtleList()
    {
    	List<烏龜商品> turtleList = new ArrayList<烏龜商品>();
    	
    	烏龜商品 龜1, 龜2;
    	龜1 = new 烏龜商品();
    	龜2 = new 烏龜商品();
    	
    	龜1.set編號("001");
    	龜1.set龜名("金錢龜");
    	龜1.set價格(3600);
    	
    	龜2.set編號("002");
    	龜2.set龜名("星龜");
    	龜2.set價格(4800);
    	
    	turtleList.add(龜1);
    	turtleList.add(龜2);
    	
    	return turtleList;
    }
}  
