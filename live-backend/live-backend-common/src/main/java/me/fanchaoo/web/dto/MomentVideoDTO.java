package me.fanchaoo.web.dto;

import lombok.Data;
import me.fanchaoo.dbo.MomentVideoDBO;

@Data
public class MomentVideoDTO extends MomentVideoDBO {

    private Boolean hasCollected;

}
