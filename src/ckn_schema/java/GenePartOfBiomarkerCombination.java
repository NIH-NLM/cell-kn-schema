package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a gene and a biomarker combination it is a member of.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GenePartOfBiomarkerCombination extends Association<Gene, String, BiomarkerCombination> {


}