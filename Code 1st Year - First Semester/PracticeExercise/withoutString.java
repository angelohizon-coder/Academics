public String withoutString(String base, String remove) {
  int counter = 0;
  
  char ch1[] = base.toCharArray();
  char ch2[] = remove.toCharArray();
  
  for (int i = 0; i < base.length(); i++)
  {
    for (int j = 0; j < base.length(); j++)
    {
      if (ch1[i] == ch2[j])
        base = base.replace (ch2[j], "");
      
      return base;
    }
  }
}