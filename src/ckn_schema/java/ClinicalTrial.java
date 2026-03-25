package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A clinical investigation that involves an intervention.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ClinicalTrial {

  private String studyId;

}