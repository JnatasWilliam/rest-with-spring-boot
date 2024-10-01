package br.com.springjonatas.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {
	
	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

	public static <O, D> D parseObject (O origin, Class<D> destination) {
		return mapper.map(origin, destination);
	}
}
