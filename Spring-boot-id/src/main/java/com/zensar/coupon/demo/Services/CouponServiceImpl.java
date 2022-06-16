package com.zensar.coupon.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.coupon.demo.Dto.CouponDto;
import com.zensar.coupon.demo.Repository.CouponRepository;
import com.zensar.coupon.demo.entity.Coupon;



@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponRepository couponrepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CouponDto getCoupon(int couponId) {
		Coupon coupon = couponrepository.findById(couponId).get();

		return modelMapper.map(coupon, CouponDto.class);
		// CouponDto dto= mapToDto(coupon);
		// return dto;
		/*
		 * CouponDto dto = new CouponDto(); dto.setCouponId(coupon.getCouponId());
		 * dto.setCouponCode(coupon.getCouponCode());
		 * dto.setExpDate(coupon.getexpDate()); return dto;
		 */
	}

	@Override
	public List<CouponDto> getAllCoupon() {
		List<Coupon> listOfCoupons = couponrepository.findAll();
		List<CouponDto> listOfDto = new ArrayList<CouponDto>();
		for (Coupon coupon : listOfCoupons) {
			//listOfDto.add(mapToDto(coupon));
			listOfDto.add(modelMapper.map(coupon, CouponDto.class));
		}

		return listOfDto;
	}

	@Override
	public CouponDto insertCoupon(CouponDto couponDto) {
		//Coupon coupon = mapToEntity(couponDto);
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		Coupon insertedCoupon = couponrepository.save(coupon);
		return modelMapper.map(insertedCoupon,CouponDto.class);
		//CouponDto mapToDto = mapToDto(insertedCoupon);
		//return mapToDto;
		/*
		 * CouponDto dto = new CouponDto();
		 * dto.setCouponId(insertedCoupon.getCouponId());
		 * dto.setCouponCode(insertedCoupon.getCouponCode());
		 * dto.setExpDate(insertedCoupon.getexpDate()); return dto;
		 */

		/*
		 * CouponDto dto = new CouponDto(); dto.setCouponId(insertCoupon.getCouponId());
		 * dto.setCouponCode(insertCoupon.getCouponCode());
		 * dto.setExpDate(insertCoupon.getexpDate()); return dto;
		 */
	}

	@Override
	public void updateCoupon(int couponId, CouponDto couponDto) {
		//Coupon coupon = mapToEntity(couponDto);
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		couponrepository.save(coupon);

		/*
		 * Coupon coupon = new Coupon(); coupon.setCouponId(couponDto.getCouponId());
		 * coupon.setCouponCode(couponDto.getCouponCode());
		 * coupon.setexpDate(couponDto.getExpDate());
		 * 
		 * couponrepository.save(coupon);
		 */
	}

	@Override
	public void deleteCoupon(int couponId) {
		couponrepository.deleteById(couponId);
	}
	/*
	 * public CouponDto mapToDto(Coupon coupon) { CouponDto dto = new CouponDto();
	 * dto.setCouponId(coupon.getCouponId());
	 * dto.setCouponCode(coupon.getCouponCode());
	 * dto.setExpDate(coupon.getexpDate()); return dto;
	 * 
	 * } public Coupon mapToEntity(CouponDto couponDto) { Coupon coupon= new
	 * Coupon(); coupon.setCouponId(couponDto.getCouponId());
	 * coupon.setCouponCode(couponDto.getCouponCode());
	 * coupon.setexpDate(couponDto.getExpDate()); return coupon; }
	 */
}