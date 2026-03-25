package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a gene and a drug wherein a gene product of that gene binds with or modifies the behavior of the drug.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneMolecularlyInteractsWithDrug extends Association<Gene, String, Drug> {


}