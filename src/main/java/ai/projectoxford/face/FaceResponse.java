/*
 *  Copyright 2016 original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package ai.projectoxford.face;

import ai.projectoxford.common.Point;
import ai.projectoxford.common.Rectangle;

/**
 * @author Vinicius Carvalho
 */
public class FaceResponse {

	private String faceId;
	private Rectangle faceRectangle;
	private FaceLandmarks faceLandmarks;
	private FaceAttributes faceAttributes;

	public String getFaceId() {
		return faceId;
	}

	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public Rectangle getFaceRectangle() {
		return faceRectangle;
	}

	public void setFaceRectangle(Rectangle faceRectangle) {
		this.faceRectangle = faceRectangle;
	}

	public FaceLandmarks getFaceLandmarks() {
		return faceLandmarks;
	}

	public void setFaceLandmarks(FaceLandmarks faceLandmarks) {
		this.faceLandmarks = faceLandmarks;
	}

	public FaceAttributes getFaceAttributes() {
		return faceAttributes;
	}

	public void setFaceAttributes(FaceAttributes faceAttributes) {
		this.faceAttributes = faceAttributes;
	}

	public static class FaceLandmarks {
		private Point pupilLeft;
		private Point pupilRight;
		private Point noseTip;
		private Point mouthLeft;
		private Point mouthRight;
		private Point eyebrowLeftOuter;
		private Point eyebrowLeftInner;
		private Point eyeLeftOuter;
		private Point eyeLeftTop;
		private Point eyeLeftBottom;
		private Point eyeLeftInner;
		private Point eyebrowRightOutter;
		private Point eyebrowRightInner;
		private Point eyeRightOuter;
		private Point eyeRightTop;
		private Point eyeRightBottom;
		private Point eyeRightInner;
		private Point noseRootLeft;
		private Point noseRootRight;
		private Point noseLeftAlarTop;
		private Point noseRightAlarTop;
		private Point noseLeftAlarOutTip;
		private Point noseRightAlarOutTip;
		private Point upperLipTop;
		private Point upperLipBottom;
		private Point lowerLipTop;
		private Point lowerLipBottom;

		public Point getPupilLeft() {
			return pupilLeft;
		}

		public void setPupilLeft(Point pupilLeft) {
			this.pupilLeft = pupilLeft;
		}

		public Point getPupilRight() {
			return pupilRight;
		}

		public void setPupilRight(Point pupilRight) {
			this.pupilRight = pupilRight;
		}

		public Point getNoseTip() {
			return noseTip;
		}

		public void setNoseTip(Point noseTip) {
			this.noseTip = noseTip;
		}

		public Point getMouthLeft() {
			return mouthLeft;
		}

		public void setMouthLeft(Point mouthLeft) {
			this.mouthLeft = mouthLeft;
		}

		public Point getMouthRight() {
			return mouthRight;
		}

		public void setMouthRight(Point mouthRight) {
			this.mouthRight = mouthRight;
		}

		public Point getEyebrowLeftOuter() {
			return eyebrowLeftOuter;
		}

		public void setEyebrowLeftOuter(Point eyebrowLeftOuter) {
			this.eyebrowLeftOuter = eyebrowLeftOuter;
		}

		public Point getEyebrowLeftInner() {
			return eyebrowLeftInner;
		}

		public void setEyebrowLeftInner(Point eyebrowLeftInner) {
			this.eyebrowLeftInner = eyebrowLeftInner;
		}

		public Point getEyeLeftOuter() {
			return eyeLeftOuter;
		}

		public void setEyeLeftOuter(Point eyeLeftOuter) {
			this.eyeLeftOuter = eyeLeftOuter;
		}

		public Point getEyeLeftTop() {
			return eyeLeftTop;
		}

		public void setEyeLeftTop(Point eyeLeftTop) {
			this.eyeLeftTop = eyeLeftTop;
		}

		public Point getEyeLeftBottom() {
			return eyeLeftBottom;
		}

		public void setEyeLeftBottom(Point eyeLeftBottom) {
			this.eyeLeftBottom = eyeLeftBottom;
		}

		public Point getEyeLeftInner() {
			return eyeLeftInner;
		}

		public void setEyeLeftInner(Point eyeLeftInner) {
			this.eyeLeftInner = eyeLeftInner;
		}

		public Point getEyebrowRightOutter() {
			return eyebrowRightOutter;
		}

		public void setEyebrowRightOutter(Point eyebrowRightOutter) {
			this.eyebrowRightOutter = eyebrowRightOutter;
		}

		public Point getEyebrowRightInner() {
			return eyebrowRightInner;
		}

		public void setEyebrowRightInner(Point eyebrowRightInner) {
			this.eyebrowRightInner = eyebrowRightInner;
		}

		public Point getEyeRightOuter() {
			return eyeRightOuter;
		}

		public void setEyeRightOuter(Point eyeRightOuter) {
			this.eyeRightOuter = eyeRightOuter;
		}

		public Point getEyeRightTop() {
			return eyeRightTop;
		}

		public void setEyeRightTop(Point eyeRightTop) {
			this.eyeRightTop = eyeRightTop;
		}

		public Point getEyeRightBottom() {
			return eyeRightBottom;
		}

		public void setEyeRightBottom(Point eyeRightBottom) {
			this.eyeRightBottom = eyeRightBottom;
		}

		public Point getEyeRightInner() {
			return eyeRightInner;
		}

		public void setEyeRightInner(Point eyeRightInner) {
			this.eyeRightInner = eyeRightInner;
		}

		public Point getNoseRootLeft() {
			return noseRootLeft;
		}

		public void setNoseRootLeft(Point noseRootLeft) {
			this.noseRootLeft = noseRootLeft;
		}

		public Point getNoseRootRight() {
			return noseRootRight;
		}

		public void setNoseRootRight(Point noseRootRight) {
			this.noseRootRight = noseRootRight;
		}

		public Point getNoseLeftAlarTop() {
			return noseLeftAlarTop;
		}

		public void setNoseLeftAlarTop(Point noseLeftAlarTop) {
			this.noseLeftAlarTop = noseLeftAlarTop;
		}

		public Point getNoseRightAlarTop() {
			return noseRightAlarTop;
		}

		public void setNoseRightAlarTop(Point noseRightAlarTop) {
			this.noseRightAlarTop = noseRightAlarTop;
		}

		public Point getNoseLeftAlarOutTip() {
			return noseLeftAlarOutTip;
		}

		public void setNoseLeftAlarOutTip(Point noseLeftAlarOutTip) {
			this.noseLeftAlarOutTip = noseLeftAlarOutTip;
		}

		public Point getNoseRightAlarOutTip() {
			return noseRightAlarOutTip;
		}

		public void setNoseRightAlarOutTip(Point noseRightAlarOutTip) {
			this.noseRightAlarOutTip = noseRightAlarOutTip;
		}

		public Point getUpperLipTop() {
			return upperLipTop;
		}

		public void setUpperLipTop(Point upperLipTop) {
			this.upperLipTop = upperLipTop;
		}

		public Point getUpperLipBottom() {
			return upperLipBottom;
		}

		public void setUpperLipBottom(Point upperLipBottom) {
			this.upperLipBottom = upperLipBottom;
		}

		public Point getLowerLipTop() {
			return lowerLipTop;
		}

		public void setLowerLipTop(Point lowerLipTop) {
			this.lowerLipTop = lowerLipTop;
		}

		public Point getLowerLipBottom() {
			return lowerLipBottom;
		}

		public void setLowerLipBottom(Point lowerLipBottom) {
			this.lowerLipBottom = lowerLipBottom;
		}
	}

	public static  class FaceAttributes {
		private float age;
		private String gender;
		private float smile;
		private String glasses;
		private FacialHair facialHair;
		private HeadPose headPose;

		public HeadPose getHeadPose() {
			return headPose;
		}

		public void setHeadPose(HeadPose headPose) {
			this.headPose = headPose;
		}

		public float getAge() {
			return age;
		}

		public void setAge(float age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public float getSmile() {
			return smile;
		}

		public void setSmile(float smile) {
			this.smile = smile;
		}

		public String getGlasses() {
			return glasses;
		}

		public void setGlasses(String glasses) {
			this.glasses = glasses;
		}

		public FacialHair getFacialHair() {
			return facialHair;
		}

		public void setFacialHair(FacialHair facialHair) {
			this.facialHair = facialHair;
		}

		public static  class FacialHair {
			private float mustache;
			private float beard;
			private float sideburns;

			public float getMustache() {
				return mustache;
			}

			public void setMustache(float mustache) {
				this.mustache = mustache;
			}

			public float getBeard() {
				return beard;
			}

			public void setBeard(float beard) {
				this.beard = beard;
			}

			public float getSideburns() {
				return sideburns;
			}

			public void setSideburns(float sideburns) {
				this.sideburns = sideburns;
			}
		}

		public static class HeadPose {
			private float roll;
			private float yaw;
			private float pitch;

			public float getRoll() {
				return roll;
			}

			public void setRoll(float roll) {
				this.roll = roll;
			}

			public float getYaw() {
				return yaw;
			}

			public void setYaw(float yaw) {
				this.yaw = yaw;
			}

			public float getPitch() {
				return pitch;
			}

			public void setPitch(float pitch) {
				this.pitch = pitch;
			}
		}
	}
}
