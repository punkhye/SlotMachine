package controller;

import model.SlotResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SlotService;

@RestController
@RequestMapping("/api/slot")  // <-- better path than "/api/controller"
@CrossOrigin
public class SlotController {

    private final SlotService slotService;

    public SlotController(SlotService slotService) {
        this.slotService = slotService;
    }

    @GetMapping("/spin")
    public SlotResult spin() {
        return slotService.spin();
    }
}
