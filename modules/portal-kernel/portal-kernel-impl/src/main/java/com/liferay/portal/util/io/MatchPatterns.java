package com.liferay.portal.util.io;

import java.io.File;
import javax.annotation.Nonnull;


























public class MatchPatterns
{
  private final MatchPattern[] patterns;
  
  private MatchPatterns(@Nonnull MatchPattern... patterns)
  {
    this.patterns = patterns;
  }
  









  public boolean matches(@Nonnull String name, boolean isCaseSensitive)
  {
    String[] tokenized = MatchPattern.tokenizePathToString(name, File.separator);
    for (MatchPattern pattern : this.patterns)
    {
      if (pattern.matchPath(name, tokenized, isCaseSensitive))
      {
        return true;
      }
    }
    return false;
  }
  





  public boolean matchesPatternStart(@Nonnull String name, boolean isCaseSensitive)
  {
    for (MatchPattern includesPattern : this.patterns)
    {
      if (includesPattern.matchPatternStart(name, isCaseSensitive))
      {
        return true;
      }
    }
    return false;
  }
  




  public static MatchPatterns from(@Nonnull String... sources)
  {
    int length = sources.length;
    MatchPattern[] result = new MatchPattern[length];
    for (int i = 0; i < length; i++)
    {
      result[i] = MatchPattern.fromString(sources[i]);
    }
    return new MatchPatterns(result);
  }
}
