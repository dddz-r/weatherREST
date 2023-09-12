package com.example.demo.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//엔티티 = 데이터 베이스의 테이블

@Data //lombook제공 어노테이션, 클레스의 모든 맴버변수 데이터세터 자동생성 (@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode 한번에 설정
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 파라미터로 생성자
@Entity
public class WeatherTable {

	@Id
	private String id;//경도+위도+날짜+시간
	private int nx; //조회지점 경도
	private int ny; //조회지점 위도
	private int base_date; //발표날짜 20210415
	private int base_time;//발표시각 0200 5 8 11 14 17 20 23 (10분에 api제공)
	private int POP; //강수확률
	private int SKY; //날씨 맑음(1), 구름많음(3), 흐림(4)
	private int T3H; // 3시간 기온
	
	public int getNx() {
		return nx;
	}


	public void setNx(int nx) {
		this.nx = nx;
	}


	public int getNy() {
		return ny;
	}


	public void setNy(int ny) {
		this.ny = ny;
	}


	public int getBase_date() {
		return base_date;
	}


	public void setBase_date(int base_date) {
		this.base_date = base_date;
	}


	public int getBase_time() {
		return base_time;
	}


	public void setBase_time(int base_time) {
		this.base_time = base_time;
	}


	public int getPOP() {
		return POP;
	}


	public void setPOP(int pOP) {
		POP = pOP;
	}


	public int getSKY() {
		return SKY;
	}


	public void setSKY(int sKY) {
		SKY = sKY;
	}


	public int getT3H() {
		return T3H;
	}


	public void setT3H(int t3h) {
		T3H = t3h;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
}