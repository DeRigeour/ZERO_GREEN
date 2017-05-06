package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.green.model.GreenFacilityInchargeInfo;
import com.green.service.GreenServiceImpl;
import com.green.service.IGreenService;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    //http://localhost:8080/greeting

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private IGreenService greenService = new GreenServiceImpl();

    @RequestMapping("/greeting")
    public List greeting(@RequestParam(value="name", defaultValue="World") String name) {

        List facilityGreenInfoList = greenService.getFacilityGreenTeamInfo();
        return facilityGreenInfoList ;
      /*  return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));*/
    }

    @RequestMapping("/facilityGreenInfo")
    public List getFacilityGreenIInfo( ) {

        List facilityGreenInfoList = greenService.getFacilityGreenTeamInfo();
        return facilityGreenInfoList ;

    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping("/greenBinAuditInfoList")
    public List getGreenBinAuditInfo( ) {

        List greenBinAuditInfoList = greenService.getGreenBinAuditInfo();
        return greenBinAuditInfoList ;

    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping("/greenFacilityInchargeInfo")
    public List getGreenFacilityInchargeInfo( ) {

        List greenBinAuditInfoList = greenService.getGreenFacilityInchargeInfo();
        return greenBinAuditInfoList ;

    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/updateGreenFacilityInchargeInfo", method = RequestMethod.POST)
    public  @ResponseBody String saveGreenFacilityInchargeInfo( @RequestBody GreenFacilityInchargeInfo member )   {

        System.out.println("=BinChargeInfo=:: bin Number==="+member.getBinIncharge());
        System.out.println("=BinChargeInfo=::Email==="+member.getFacilityGreenTeamInfo().getEmail());
        String response = "success";
        return response;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping("/greenBinsInfo")
    public List getGreenBinsInfo( ) {

        List greenBinsInfoList = greenService.getGreenBinsInfo();
        return greenBinsInfoList ;

    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping("/facilityRoleAccess")
    public List getFacilityRoleAccess( ) {

        List facilityRoleAccessList = greenService.getFacilityRoleAccess();
        return facilityRoleAccessList ;

    }


}

