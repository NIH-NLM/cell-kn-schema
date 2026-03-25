package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell type and the anatomical structure it is part of.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellTypePartOfAnatomicalStructure extends Association<CellType, String, AnatomicalStructure> {


}