package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a protein and a biological process that it is directly involved in carrying out.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ProteinInvolvedInBiologicalProcess extends Association<Protein, String, BiologicalProcess> {


}