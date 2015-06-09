package bache.map;

import java.util.List;
import java.util.function.Function;

import io.baratine.core.Result;

public interface MapManagerService<K,V>
{
  void exists(K key, Result<Boolean> result);
  void find(Function<K,Boolean> matcher, Result<List<K>> result);

  void deleteSequentially(Result<Integer> result, K ... keys);
  void deleteFork(Result<Integer> result, K ... keys);
}
