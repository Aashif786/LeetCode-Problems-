import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:

    return students.astype({'grade':int})
    # students['grade']= students['grade'].astype(int)
    # return students