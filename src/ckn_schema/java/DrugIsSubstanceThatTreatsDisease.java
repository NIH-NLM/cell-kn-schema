package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a drug and a disease that it has been shown in a phase III clinical trial to be safe and effective at treating.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DrugIsSubstanceThatTreatsDisease extends Association<Drug, String, Disease> {


}