package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a drug and some gene whose gene products directly interact with the drug. This is a symmetric relationship.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DrugMolecularlyInteractsWithGene extends Association<Drug, String, Gene> {


}