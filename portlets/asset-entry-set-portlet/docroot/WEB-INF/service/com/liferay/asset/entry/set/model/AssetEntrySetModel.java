/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.asset.entry.set.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the AssetEntrySet service. Represents a row in the &quot;AssetEntrySet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.asset.entry.set.model.impl.AssetEntrySetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.asset.entry.set.model.impl.AssetEntrySetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetEntrySet
 * @see com.liferay.asset.entry.set.model.impl.AssetEntrySetImpl
 * @see com.liferay.asset.entry.set.model.impl.AssetEntrySetModelImpl
 * @generated
 */
public interface AssetEntrySetModel extends BaseModel<AssetEntrySet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset entry set model instance should use the {@link AssetEntrySet} interface instead.
	 */

	/**
	 * Returns the primary key of this asset entry set.
	 *
	 * @return the primary key of this asset entry set
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset entry set.
	 *
	 * @param primaryKey the primary key of this asset entry set
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the asset entry set ID of this asset entry set.
	 *
	 * @return the asset entry set ID of this asset entry set
	 */
	public long getAssetEntrySetId();

	/**
	 * Sets the asset entry set ID of this asset entry set.
	 *
	 * @param assetEntrySetId the asset entry set ID of this asset entry set
	 */
	public void setAssetEntrySetId(long assetEntrySetId);

	/**
	 * Returns the company ID of this asset entry set.
	 *
	 * @return the company ID of this asset entry set
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset entry set.
	 *
	 * @param companyId the company ID of this asset entry set
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this asset entry set.
	 *
	 * @return the user ID of this asset entry set
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this asset entry set.
	 *
	 * @param userId the user ID of this asset entry set
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset entry set.
	 *
	 * @return the user uuid of this asset entry set
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this asset entry set.
	 *
	 * @param userUuid the user uuid of this asset entry set
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create time of this asset entry set.
	 *
	 * @return the create time of this asset entry set
	 */
	public long getCreateTime();

	/**
	 * Sets the create time of this asset entry set.
	 *
	 * @param createTime the create time of this asset entry set
	 */
	public void setCreateTime(long createTime);

	/**
	 * Returns the modified time of this asset entry set.
	 *
	 * @return the modified time of this asset entry set
	 */
	public long getModifiedTime();

	/**
	 * Sets the modified time of this asset entry set.
	 *
	 * @param modifiedTime the modified time of this asset entry set
	 */
	public void setModifiedTime(long modifiedTime);

	/**
	 * Returns the asset entry ID of this asset entry set.
	 *
	 * @return the asset entry ID of this asset entry set
	 */
	public long getAssetEntryId();

	/**
	 * Sets the asset entry ID of this asset entry set.
	 *
	 * @param assetEntryId the asset entry ID of this asset entry set
	 */
	public void setAssetEntryId(long assetEntryId);

	/**
	 * Returns the parent asset entry set ID of this asset entry set.
	 *
	 * @return the parent asset entry set ID of this asset entry set
	 */
	public long getParentAssetEntrySetId();

	/**
	 * Sets the parent asset entry set ID of this asset entry set.
	 *
	 * @param parentAssetEntrySetId the parent asset entry set ID of this asset entry set
	 */
	public void setParentAssetEntrySetId(long parentAssetEntrySetId);

	/**
	 * Returns the creator class name ID of this asset entry set.
	 *
	 * @return the creator class name ID of this asset entry set
	 */
	public long getCreatorClassNameId();

	/**
	 * Sets the creator class name ID of this asset entry set.
	 *
	 * @param creatorClassNameId the creator class name ID of this asset entry set
	 */
	public void setCreatorClassNameId(long creatorClassNameId);

	/**
	 * Returns the creator class p k of this asset entry set.
	 *
	 * @return the creator class p k of this asset entry set
	 */
	public long getCreatorClassPK();

	/**
	 * Sets the creator class p k of this asset entry set.
	 *
	 * @param creatorClassPK the creator class p k of this asset entry set
	 */
	public void setCreatorClassPK(long creatorClassPK);

	/**
	 * Returns the payload of this asset entry set.
	 *
	 * @return the payload of this asset entry set
	 */
	@AutoEscape
	public String getPayload();

	/**
	 * Sets the payload of this asset entry set.
	 *
	 * @param payload the payload of this asset entry set
	 */
	public void setPayload(String payload);

	/**
	 * Returns the child asset entry sets count of this asset entry set.
	 *
	 * @return the child asset entry sets count of this asset entry set
	 */
	public int getChildAssetEntrySetsCount();

	/**
	 * Sets the child asset entry sets count of this asset entry set.
	 *
	 * @param childAssetEntrySetsCount the child asset entry sets count of this asset entry set
	 */
	public void setChildAssetEntrySetsCount(int childAssetEntrySetsCount);

	/**
	 * Returns the ratings stats total score of this asset entry set.
	 *
	 * @return the ratings stats total score of this asset entry set
	 */
	public int getRatingsStatsTotalScore();

	/**
	 * Sets the ratings stats total score of this asset entry set.
	 *
	 * @param ratingsStatsTotalScore the ratings stats total score of this asset entry set
	 */
	public void setRatingsStatsTotalScore(int ratingsStatsTotalScore);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.asset.entry.set.model.AssetEntrySet assetEntrySet);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.asset.entry.set.model.AssetEntrySet> toCacheModel();

	@Override
	public com.liferay.asset.entry.set.model.AssetEntrySet toEscapedModel();

	@Override
	public com.liferay.asset.entry.set.model.AssetEntrySet toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}